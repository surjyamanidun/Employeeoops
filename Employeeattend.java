package employeeoops;

   public class Employeeattend {
	public void empPresentCheck() {
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 0) {
            System.out.println("Employee Present");
        } else {
            System.out.println("Employee absent");
        }
    }

    //main method
    public static void main(String[] args) {
    	Employeeattend obj = new Employeeattend();
        obj.empPresentCheck();

    }
}

