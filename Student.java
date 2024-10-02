package Chapterall;
public class Student{
public Student(){ 
    //đây là hàm tao mac dinh khon co tham so neu ko tao may se tao cho
    // con neu tao r java se khong tao nua lên neu muon dung ta phai tu tao
}

public Student(String name1,int age1){
    this.name =name1 ;//this.name là thuoc tinh name o tren
    this.age = age1;  //môi mot lan ta khoi tao nhu la môt lan ta nhan ban class chung ta gan cho no bang gia tri dau vao.no la tham chieu gia tri trn cho ben duoi
    //QUy tăc ham tao la ten ham tao trung với ten cua class .đồng thời nó cũng khôgn can co returrn tipe cung đc
    //key word public it khi dung nêu muon tương minh thi dung boi khi ta ko khai bao java cung mac dinh no la public
}
String name;
int age ;
}
//để thao tác với một biến oject bắt buộc ta phải tạo mới cho mình một biến (new,vd video23 test = new video23(),rồi gọi nó qua dấu cháma  test.)
