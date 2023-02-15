package enc;
 class insta
{
	 private int pwd=123;

	public int getPwd() {
		return pwd;
	}

	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
public class Customer {

	public static void main(String[] args) {
		insta i1=new insta();
		System.out.println(i1.getPwd());
		i1.setPwd(123);
		System.out.println("new password ="+i1.getPwd());
	}

}
