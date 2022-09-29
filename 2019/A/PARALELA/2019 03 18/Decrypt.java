public class Decrypt extends Thread {

    @Override
    public void start() {

        int passLength = 7;
        int checkSum = 3492;
        int checkSumPow = 141204219;
        String encrypted = new String(new char[] { 21, 1, 65, 0, 10, 7, 8, 26, 19, 18, 77, 8, 6, 18, 0, 19, 12, 77, 11,
                12, 65, 4, 0, 4, 30, 10, 7, 21, 17, 1, 65, 14, 14, 27, 14, 7 });
        String temp = "abcdefghijklmnopqrstuvwxyz0123456789";

        String key = "";

        for (int a = 0; a < temp.length(); a++) {
            for (int b = 0; b < temp.length(); b++) {
                for (int c = 0; c < temp.length(); c++) {
                    for (int d = 0; d < temp.length(); d++) {
                        for (int e = 0; e < temp.length(); e++) {
                            for (int f = 0; f < temp.length(); f++) {
                                for (int g = 0; g < temp.length(); g++) {
                                    
                                    // Bruteforce
                                    key = String.valueOf(temp.charAt(a)) + String.valueOf(temp.charAt(b))
                                            + String.valueOf(temp.charAt(c)) + String.valueOf(temp.charAt(d))
                                            + String.valueOf(temp.charAt(e)) + String.valueOf(temp.charAt(f))
                                            + String.valueOf(temp.charAt(g));


                                    String password = "";
                                    int count = 0;
                                    int sum = 0;
                                    int sumPow = 0;

                                    
                                    for (int h = 0; h < encrypted.length(); h++) {
                                        
                                        int l = (encrypted.charAt(h) ^ key.charAt(count++));
                                        sum += l;
                                        sumPow += (int) (Math.pow(encrypted.charAt(h), h + l));
                             
                                        password += (char) l;

                                        if (count == passLength) {
                                            count = 0;
                                        }
                                    }

                                    // found
                                    if (sum == checkSum && sumPow == checkSumPow) {
                                        System.out.println(key + " - " + password);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors();

        for (int i = 0; i < cores; i++) {
            Decrypt d = new Decrypt();
            d.start();
        }
    }
}