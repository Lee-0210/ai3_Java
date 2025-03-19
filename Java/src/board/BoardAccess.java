package board;

public class BoardAccess implements BoardInterface {

	// 게시글 개수 
	int count = 1;
	// 게시글 목록
	Board[] boardList = new Board[BoardInterface.MAX_COUNT]; 
	
	public BoardAccess() {
		boardList[0] = new Board(1, "제목01", "작성자01", "내용01", "2025/03/19 - 18:00:00", "2025/03/19 - 18:00:00");
	}
	
	/**
	 * 게시글 등록
	 * 1. 매개변수로 넘겨받은 board 객체에 게시글 번호를 부여한다.
	 * 2. 등록일자와 수정일자를 현재 날짜/시간으로 지정한다.
	 * 3. board 객체를 현재까지 등록된 배열요소 다음 index 에 저장한다.
	 * 4. 등록된 board 객체를 반환한다.
	 * * 게시글 목록이 가득 찼는지 확인한다.
	 */
	@Override
	public Board create(Board board) {
		if(this.count == BoardInterface.MAX_COUNT) {
			System.out.println("게시글 목록이 꽉 찼습니다.");
			return null;
		}
		
		int no = ++count;
		String createAt = "2025/03/19 - 18:00:00";
		String updateAt = "2025/03/19 - 18:00:00";
		board.setNo(no);
		board.setCreateAt(createAt);
		board.setUpdateAt(updateAt);
		
		boardList[no-1] = board;
		System.out.println("게시글이 등록되었습니다.");
		System.out.println();
		return board;
	}
	
	/**
	 * 게시글 목록
	 * 1. 게시글이 존재하는지 확인하고 1개의 게시글도 없으면 null 반환
	 * 2. 게시글이 존재하면, 전체 게시글 배열인 boardList를 반환
	 */
	@Override
	public Board[] list() {
		if(this.count == 0) {
			System.out.println("조회된 게시글이 없습니다.");
			return null;
		}
		
		return boardList;
	}

	@Override
	public Board read(int no) {
	 
		return boardList[no-1];
	}

	@Override
	public boolean update(Board board) {
		if(board == null) {
			System.out.println("선택하신 게시글은 존재하지 않습니다. \n");
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean delete(int no) {
		if(boardList[no-1] == null) {
			System.out.println(no + "번 게시글은 존재하지 않스빈다.");
			return false;
		} else {
			boardList[no-1] = null;
			count--;
			return true;
		}
	}
	
}
