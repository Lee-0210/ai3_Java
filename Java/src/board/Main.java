package board;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void printBoard() {
		System.out.println("::::: 게시글 목록을 조회합니다. :::::");
	}
	
	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess();
		Board[] boardList = boardInterface.list();
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		
		System.out.println("게시판 프로그램을 실행합니다.");
		do {
			System.out.println("::::: 게시판 :::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			try {
				menuNo = sc.nextInt();
				sc.nextLine();
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력해주세요. \n");
				sc.nextLine();
				continue;
			}
			System.out.println();
			
			if(menuNo == 0) {
				System.out.println("게시판 프로그램을 종료합니다.");
				break;
			}
			
			switch (menuNo) {
				case 1: 
					printBoard();
					if(boardList != null)
						for(Board board : boardList) {
							System.out.println(board);
						}
					System.out.println();
					break;
					
				case 2: 
					System.out.println("::::: 게시글 등록 :::::");
					System.out.print("제목 : ");
					String title = sc.nextLine();
					System.out.print("작성자 : ");
					String writer = sc.nextLine();
					System.out.print("내용 : ");
					String content = sc.nextLine();
					
					Board board = new Board(title, writer, content);
					Board createBoard = boardInterface.create(board);
					
					if(createBoard != null) {
						System.out.println("::::: 등록된 게시글 정보 :::::");
						System.out.println(createBoard);
						System.out.println();
					}
					break;
					
				case 3: 
					printBoard();
					if(boardList != null)
						for(Board board1 : boardList) {
							System.out.println(board1);
						}
					System.out.println();
				
					int readNo = 0;
				
					try {
						System.out.print("조회할 게시글 번호 : ");
						readNo = sc.nextInt();
						sc.nextLine();
					
						System.out.println("::::: " + readNo + "번 게시글의 내용 :::::" );
						System.out.println("작성자 : " + boardInterface.read(readNo).getWriter());
						System.out.println("내용 : " + boardInterface.read(readNo).getContent());
						System.out.println("최근 수정 날짜 : " + boardInterface.read(readNo).getUpdateAt());
						System.out.println();
						
					} catch(NullPointerException e) {
							System.out.println(readNo + "번 게시글은 존재하지 않습니다. \n");
					} catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("게시글은 10번까지입니다. \n");
					} catch(InputMismatchException e) {
							System.out.println("숫자만 입력해주세요.");
							sc.nextLine();
					}
					
					break;
					
				case 4:
					printBoard();
					if(boardList != null)
						for(Board board1 : boardList) {
							System.out.println(board1);
						}
					System.out.println();
					
					try {
						System.out.print("수정할 게시글 번호 : ");
						int updateNo = sc.nextInt();
						sc.nextLine();
						
						if(boardInterface.update(boardList[updateNo-1]) != false) {
							System.out.println("::::: 수정하기 전 " + updateNo + "번 게시글 내용 :::::");
							System.out.println(boardInterface.read(updateNo).getContent());
							System.out.println();
							System.out.print("수정 내용 : ");
							String newContent = sc.nextLine();
							boardList[updateNo-1].setContent(newContent);
							boardList[updateNo-1].setUpdateAt("2025/03/20 - 09:30:00");
							System.out.println("수정 되었습니다. \n");
						}
						
					} catch(InputMismatchException e) {
							System.out.println("숫자만 입력해주세요. \n");
					} catch(ArrayIndexOutOfBoundsException e) {
							System.out.println("게시글은 10번까지입니다. \n");
					}
					
					break;
					
				case 5: 
					printBoard();
					if(boardList != null)
						for(Board board1 : boardList) {
							System.out.println(board1);
						}
					System.out.println();
					
					int deleteNo = 0;
					
					try {
						System.out.print("삭제할 게시글 번호 : ");
						deleteNo = sc.nextInt();
						sc.nextLine();
						
						System.out.println("정말 삭제하시겠습니까? : y / n");
						boolean check = false;
						String answer = sc.nextLine();
						
						if(answer.equals("y")) {
							check = boardInterface.delete(deleteNo);
						} else if(answer.equals("n")) {
							System.out.println("삭제를 취소하였습니다. \n");
							break;
						} else {
							System.out.println("잘못 입력하였습니다. \n");
							break;
						}
						
						if(check) {
							System.out.println(deleteNo + "번 게시글이 삭제되었습니다. \n");
						} else {
							System.out.println("삭제 오류입니다. \n");
						}
						
					} catch(InputMismatchException | IndexOutOfBoundsException e) {
							System.out.println("삭제 오류입니다. \n");
							break;
					}
					
					break;
			} 
		} while (true);
		
		sc.close();
	}
}
