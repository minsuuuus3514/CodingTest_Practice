package chaining;

// 덧셈, 뺄셈에 대한 클래스
public class Calculator {
	
	int num = 0;
	
	public Calculator add(int plus) {
		this.num += plus;
		return this;
	}
	
	public Calculator substract(int minus) {
		this.num -= minus;
		return this;
	}
	
	public int out() {
		return num;
	}
}
