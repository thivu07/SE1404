/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import util.MyToys;
import static util.MyToys.cF; //đây là kĩ thuật giống C
                                //ở dưới gọi hàm static mà ko có chấm

/**
 *
 * @author THANH THI
 */
public class MyToysTest {
    
    //chỗ này dùng để test các hàm ta viết, đảm bảo chất lượng
    //mỗi hàm ta test ta cần chuẩn bị sẵn data, giá trị kì vọng
    //và xem kq xử lý, và phải so sánh xem đúng kì vọng ko, ko đúng kì vọng thì sai ở đâu? sai ở data mẫu hay sai ở code
    //vd tui muốn kt coi 5! có trả về 120 hay ko, khi chạy hàm -> 1 test case 
    //1 tình huống test
    //login: case 1 -> đúng user/pass -> ok vào đúng trang
    //       case 2 -> đúng user said pass -> khả năng quên pass
    //
    
    //tình huống hàm cF() chạy đúng, bản chất mỗi case phải là một hàm, ta gộp
    @Test //biến hàm bất kì đi kèm 
    public void testSuccessfulCases() {
        assertEquals(
                1, cF(0)); //hàm so sánh ra màu và in ra màu xanh khớp, đỏ nếu không khớp
        //thay vì luận bằng mắt
        assertEquals(2  , cF(2));
        assertEquals(6, cF(3));
        assertEquals(24, cF(4));
        assertEquals(120, cF(5));
        assertEquals(720, cF(6));
    }
    
    //ngoại lệ thì sao, ngoại lệ ko phải là 1 value để so sánh
    //nó là cái bất thường nào đó xảy ra, ko ước lượng đc chính xác nó là giá trị gì
    //do đó k thể so sánh với 1 cái khác, ko xài hàm assertX() đc
    
    @Test(expected = Exception.class)
    public void testExceptionCases(){
        cF(-5);
        cF(-6);
    }
}

//Ant chỉ quan tâm code không quan tâm sai cú pháp, ko thiếu thư viện, auto ra .jar, .war, .car, .apk
//lỗi logic nó ko check dc, cụ thể bài này đang bị lỗi

//phải dạy cho Ant biết cách: code ko sai cú pháp, ko thiếu thư viện import, màu xanh của JUnit mới ra dc .jar

//Ant ko thông minh, chỉ biết làm theo những gì đc chỉ để làm ở trong file build.xml và file build-imp.xml
//độ  file này 1 chút, độ ở dòng 1005 NetBeans 8, 1204 NetBeans 11
