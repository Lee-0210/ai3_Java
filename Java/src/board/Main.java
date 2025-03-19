package board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BoardInterface boardInterface = new BoardAccess();
		Scanner sc = new Scanner(System.in);
		int menuNo = 0;
		do {
			System.out.println(":::::: 게시판 ::::::");
			System.out.println("1. 게시글 목록");
			System.out.println("2. 게시글 등록");
			System.out.println("3. 게시글 조회");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			menuNo = sc.nextInt();
			sc.nextLine();
			if(menuNo == 0) break;
			
			switch (menuNo) {
				case 1: 
					Board[] boardList = boardInterface.list();
					if(boardList != null)
						for(Board board : boardList) {
							System.out.println(board);
						}
					break;
				case 2: 
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
					}
					break;
				case 3: 
					System.out.print("조회할 게시글 번호 : ");
					int readNo = sc.nextInt();
					sc.nextLine();
					System.out.println("::::: " + readNo + "번 게시글의 내용 :::::" );
					System.out.println("작성자 : " + boardInterface.read(readNo).getWriter());
					System.out.println("내용 : " + boardInterface.read(readNo).getContent());
					System.out.println("최근 수정 날짜 : " + boardInterface.read(readNo).getUpdateAt());
				case 4: 
					System.out.print("수정할 게시글 번호 : ");
					int updateNo = sc.nextInt();
					sc.nextLine();
					Board[] boardList2 = boardInterface.list();
					System.out.println("::::: 수정하기 전 " + updateNo + "번 게시글 내용 :::::");
					System.out.println(boardList2[updateNo-1].getContent());
					System.out.println("내용 : " + boardInterface.read(updateNo).getContent());
					
				case 5: 
				case 0: 
			} 
		} while (true);
	
	}
}
