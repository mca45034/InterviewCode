package Immutable;

public final class immutable {
	private final int no;
	public immutable(int no) {
		this.no=no;
	}
	public int getNo() {
		return no;
	}
	public static void main(String[] args) {
		immutable m=new immutable(1234);
		System.out.println(m.getNo());
	}
	

}
