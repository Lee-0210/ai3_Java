package Day15.Ex03_File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * - 메뉴 출력 메서드
 * - 폴더 내의 파일 목록
 * - 파일 정보 조회
 * - 파일 생성
 * - 파일 삭제
 * - 폴더 생성
 * - 폴더 삭제
 */
public class FileManager {
		
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 메뉴 출력 메서드
	 */
	private void menu() {
		System.out.println(":::::::::: 파일 관리 ::::::::::");
		System.out.println("1. 파일 목록");
		System.out.println("2. 파일 조회");
		System.out.println("3. 폴더 생성");
		System.out.println("4. 폴더 삭제");
		System.out.println("5. 파일 생성");
		System.out.println("6. 파일 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print(":::::::::: 번호 : ");
	}
	
	/**
	 * 파일 목록
	 * @param path
	 */
	private void fileList(String path) {
		System.out.println(path);
		System.out.println("------------------------------------------");
		File file = new File(path);		// 경로를 지정하여 파일 객체 생성
		File[] fileList = file.listFiles();		// 하위 경로의 파일 목록을 File[] 배열로 반환
		
		System.out.println("파일명 \t\t 용량 \t\t 수정일자");
		for (File subFile : fileList) {
			long update = subFile.lastModified();	// 최종 수정일자
			Date date = new Date(update);		// java.util.Date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			// 날짜
			String updateDate = sdf.format(date);
			// 파일명
			String fileName = subFile.getName();
			//용량
			long size = subFile.length();
			System.out.print(fileName + "\t\t");
			System.out.print(size + "\t\t");
			System.out.print(updateDate + "\t\t");
			System.out.println();
			
		}
		System.out.println("------------------------------------------");
	}
	
	/**
	 * 파일 조회
	 * @param filePath
	 */
	private void fileInfo(String filePath) {
		File file = new File(filePath);
		System.out.print("파일 종류 : ");
		if(file.isDirectory()) System.out.println("디렉토리");
		if(file.isFile()) System.out.println("일반 파일");
		
		long update = file.lastModified();
		Date date = new Date(update);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String updateDate = sdf.format(date);
		
		System.out.print(file.getName() + "\t\t");
		System.out.print(file.length() + "\t\t");
		System.out.print(updateDate + "\t\t");
		System.out.println();
	}
	
	/**
	 * 폴더 생성
	 * @param path
	 */
	private void makeDirectory(String path) {
		File file = new File(path);

		// 폴더 생성
		// mkdir()		: 생성할 경로의 상위 경로까지 기존 디레곹리가 존재해야한다. (없으면 에러)
		// mkdirs()		: 생성할 경로의 상위 경로까지 디렉토리를 생성해준다.
		if(file.mkdir()) {
			System.out.println("디렉토리 생성 성공");
		} else {
			System.out.println("디렉토리 생성 실패!");
		}
		System.out.println("경로 : " + path);
	}
	
	/**
	 * 폴더 삭제
	 * @param path
	 */
	private void deleteDirectory(String path) {
		// TODO : 지정 폴더 하위 경로에 다른 파일이 있으면?
		// 		  폴더 안에 폴더가 있으면 -> 재귀호출로 삭제
		// 1. 하위 경로에 파일들을 삭제
		// 2. 해당 폴더 삭제
		File file = new File(path);
		File[] fileList = file.listFiles();
		
		// 하위 경로에 파일이 있으면, 하위 파일을 먼저 삭제
		if(fileList != null) {
			for(File subFile : fileList) {
				String subFilePath = subFile.getPath();
				// 재귀 호출(재귀 함수 : recursive)
				deleteDirectory(subFilePath);
			}
		}
		// 폴더(파일) 삭제
		if(file.delete()) {
			System.out.println("폴더(파일) 삭제 성공!");
		} else {
			System.out.println("폴더(파일) 삭제 실패!");
		}
		
	}
	
	/**
	 * 파일 생성
	 * @param path		: 파일을 생성할 경로
	 * @param filename	: 파일명
	 */
	private void createFile(String path, String fileName) {
		// 1. File 객체 생성
		// 2. File 객체를 초기화하는 FileWriter 객체 생성
		// 3. 사용자로부터 문자열 입력
		// 4. 입력받은 문자열을 지정한 파일에 출력
		// * 예외 처리
		File file = new File(path, fileName);
		try(
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
		) {
			System.out.print("파일 내용 : ");
			String str = sc.nextLine();
			fw.write(str);
			System.out.println(fileName + " 파일을 생성하였습니다.");
		} catch (Exception e) {
			System.err.println("파일을 생성 시, 문제가 발생하였습니다.");
			e.printStackTrace();
		}
	}
	
	/**
	 * 파일 삭제
	 * @param filePath
	 */
	private void deleteFile(String filePath) {
		File file = new File(filePath);
		
		// 파일 존재 여부 확인
		if(file.exists() && file.delete()) {
			System.out.println("파일 삭제 성공!");
		} else if(file.exists()) { 
			System.out.println("파일 삭제 실패!");
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
	
	public static void main(String[] args) {
		FileManager fm = new FileManager();
		int menuNo;		// 메뉴번호
		String filePath = "";
		do {
			// 메뉴판 출력
			fm.menu();
			// 메뉴번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			if(menuNo == 0) break;
			// 파일 경로
			System.out.print("파일 경로 : ");
			filePath = sc.nextLine();
			// 메뉴 선택
			// 1 ~ 6 
			switch(menuNo) {
				case 1:
					fm.fileList(filePath); break;
				case 2:
					fm.fileInfo(filePath); break;
				case 3:
					fm.makeDirectory(filePath); break;
				case 4:
					fm.deleteDirectory(filePath); break;
				case 5:
					System.out.print("파일 이름 : ");
					String fileName = sc.nextLine();
					fm.createFile(filePath, fileName);
					break;
				case 6:
					fm.deleteFile(filePath); break;
			}
		} while (true);
		System.out.println("시스템을 종료합니다.");
		sc.close();
	}
}
