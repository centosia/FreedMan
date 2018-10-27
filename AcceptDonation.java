package org.acceptdon;

class AcceptDonation {
    private int donation;
    
    public static void main(String args[]) {
          AcceptDonation ad = new AcceptDonation();
          ad.accept();
    }
    
    private void accept() {
        System.out.println("Make donation");
        Scanner sc = new Scanner(System.in);
        int don = sc.nextInt();
        System.out.println("Donation"+don+"made");
    }
}
