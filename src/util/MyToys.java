/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author THANH THI
 */
public class MyToys {
    //class này chứa các hàm tiện ích xài chung cho mọi dự án, nơi nên nó sẽ là static
    
    public static long cF(int n){
        //cF: compute Factorial, tính giai thừa = 1x2x3x...xn
        //trong đó n >= 0, 0 != 1;
        //n! bùng nổ value rất nhanh, nên phải xài long để lưu kết quả (khoảng 15!)
        //dành cho CI/Continuous Intergration, đệ quy recursion sau
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("n must be between 0 ... 15");
        if(n == 0)
            return 1;
        //đến đây n sẽ ở khoảng 1 ... 15
        long product = 1; //biến nhân dồn, gom, tích lũy accumulation
        for (int i = 1; i < n; i++) {
            product *= i;
        }
        return product;
    }
    
}
