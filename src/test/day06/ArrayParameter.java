package test.day06;

public class ArrayParameter {
	static void replaceSpace(char a[]) {	// stack����, heap����, code����, data����
		for (int i=0;i<a.length;i++) {		// heap������ ����Ű�� �� �ؽ��ڵ��̹Ƿ�, �迭���°� �ƴϸ� �׳� ���� ���޵ȴ�.
			if(a[i]==' ');					// 
				a[i]=',';
		}
	}
	static void printCharArray(char a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]);		//�迭 ���� ���� ���
			System.out.println();		//�迭 ���� ��� ��� �� �ٹٲ�
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
	���ذ� �� �ȴ�. ������...
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