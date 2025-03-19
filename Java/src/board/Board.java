package board;

/**
 * 게시글 정보
 * - 게시글 번호
 * - 제목
 * - 작성자
 * - 내용
 * - 등록일자
 * - 수정일자
 */
public class Board {
	// 필드 변수
	private int no;
	private String title;
	private String writer;
	private String content;
	private String createAt;
	private String updateAt;
	
	public Board() {
		this("제목없음", "작성자없음", "내용없음");
	}
	
	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	public Board(int no, String title, String writer, String content, String createAt, String updateAt) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}

	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", writer=" + writer + ", content=" + content + ", createAt="
				+ createAt + ", updateAt=" + updateAt + "]";
	}
}
