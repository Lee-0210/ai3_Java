package Day15.Ex01_ByteStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

	public static void main(String[] args) {
		// 파일 경로
		String filePath = "sample.dat";
		
		try(
			// FileOutputStream 객체를 이용하여, Byte 단위로 데이터 출력
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			DataOutputStream dos = new DataOutputStream(bos);
		) {
			dos.writeInt(123);
			dos.writeDouble(123);
			dos.writeBoolean(true);
			System.out.println("sample.dat 파일을 출력하였습니다.");
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
