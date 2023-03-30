public class MyHash {

    public static int getHash(String s) {
     	byte[] bs = s.getBytes();
        int sum = 0;
  		for(int i =0; i<bs.length;i++) {
            sum+=bs[i];
  		}
  		return sum % 100;
  	}

  public static void main(String[] args) {
    System.out.println("Java: " + getHash("Java"));
    System.out.println("Oracle: " + getHash("Oracle"));
    System.out.println("JDK: " + getHash("JDK"));
    System.out.println("JVM: " + getHash("JVM"));
    System.out.println("IntelliJ: " + getHash("IntelliJ"));
    System.out.println("Eclipse: " + getHash("Eclipse"));
    System.out.println("Class: " + getHash("Class"));
    System.out.println("class: " + getHash("class"));
  }

}
