import java.util.Scanner;

class GStack<T> {
    int tos;
    Object [] stck;
    public GStack() {
        tos = 0;
        stck = new Object [5];
    }
    public void push(T item) {
        if(isFull())
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(isEmpty())
            return null;
        tos--;
        return (T)stck[tos];
    }
    public boolean isEmpty() {
        if (tos == 0)
            return true;
        else
            return false;
    }
    public boolean isFull(){
        if(tos == 5)
            return true;
        else
            return false;
    }
}
public class MyStack {
    public static void main(String[] args) {
        System.out.println("2014184038 한승욱");
        Scanner scanner = new Scanner(System.in);
        GStack<String> stringStack = new GStack<String>();

        int i=1;
        while(true){
            if(i == 6)
                break;
            else {
                System.out.print("단어를 입력하시오: ");
                String input = scanner.next();
                if(input.equals("exit"))
                    break;
                stringStack.push(input);
                i++;
            }
        }

        for(int n=0; n<6; n++)
            System.out.println(stringStack.pop());

//        GStack<Integer> intStack = new GStack<Integer>();
//        intStack.push(1);
//        intStack.push(3);
//        intStack.push(5);
//
//        for(int n=0; n<3; n++)
//            System.out.println(intStack.pop());
    }
}
