package jp.issue.raisetech;

public class Hello {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("HelloWorld!");
		System.out.print("\n");
		int n = 0;
		while(n < 5) {
			int i = 0;
		
			for(; i < 4; i++) {
				System.out.println("Hello");
			}
		System.out.print("\n");
			for(; i < 10; i++) {
				if(i % 2 == 0) {
					System.out.println("HelloRaiseTech");
				}else {
					System.out.println("こんにちはレイズテック!");
				}
				
				if(i == 7) {
					break;
				}
		
			}
		System.out.println("********************************");	
			n++;
		}
		System.out.println("END");
		
		
	}

}
