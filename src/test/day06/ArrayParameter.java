package test.day06;

public class ArrayParameter {
	static void replaceSpace(char a[]) {	// stack영역, heap영역, code영역, data영역
		for (int i=0;i<a.length;i++) {		// heap영역을 가리키는 건 해시코드이므로, 배열형태가 아니면 그냥 값만 전달된다.
			if(a[i]==' ');					// 
				a[i]=',';
		}
	}
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);		//배열 원소 문자 출력
			System.out.println();		//배열 원소 모두 출력 후 줄바꿈
		}
	}
	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};
		printCharArray(c);
		replaceSpace(c);
		printCharArray(c);
		
	}
}
/*
	이해가 안 된다. 으으읔...
		stack		|		heap
					|					
					|	
					|	
					|	
					|
					|						
----------------------------------------
		code		|		data
					|	
					|	
					|	
					|
					|	
*/