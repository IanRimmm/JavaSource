package conding.day13;
/*
 - 
 */
import java.io.*;
import java.util.*;

public class FileDirectoryMakingMain {
	
	public static void main(String[] args) {
		FileDirectoryMaking fm = new FileDirectoryMaking();
		System.out.println("aaa 디렉토리 생성 : " +fm.make("aaa"));
		System.out.println("bbb 디렉토리 생성 : " +fm.make("bbb"));
		System.out.println("디렉토리명 변경 : " +fm.renameTo("aaa", "bbb"));
		System.out.println("디렉토리 삭제 : " +fm.delete("ccc"));
	}
}

class FileDirectoryMaking{
	
	public boolean make(String fname) {
		File f = new File(fname);
		if(f.isDirectory()&&f.exists()) {
			System.out.println(fname + "가 이미 존재함");
			return false;
		}
		f.setLastModified(new Date().getTime()); //수정일
		return f.mkdir();
	}
	public boolean renameTo(String fname, String newName) {
		File f = new File(fname);
		if(!f.exists()) {
			System.out.println(fname + "가 없다.");
			return false;
		}
		f.setLastModified(new Date().getTime()); //수정일
		return f.renameTo(new File(newName));
	}
	public boolean delete(String fname) {
		File f = new File(fname);
		if(!f.exists()) {
			System.out.println(fname + "가 없다.");
			return false;
		}
		//cf f.deleteOnExit();
		return f.delete();
	}
}