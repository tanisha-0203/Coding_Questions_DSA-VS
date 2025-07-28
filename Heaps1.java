import java.lang.reflect.Array;
import java.util.*;
public class Heaps1 {
    public class heap{
        ArrayList<Integer> arr= new ArrayList<>();
        public void add(int data){   //o(1)
            arr.add(data);


            int x =arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){   //o(logn)
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
            }
        }

// GET MINIMUN VALUE OF THE HEAP I.E ROOT OF HEAP
        public int peek(){
            return arr.get(0);
        }

// hum heapofy mei basically yeh kr rhe hai ki jaise ek node ka index pass hoga jo bhi dlete krni hogi uska left and right child niklega with the formula and then min is initialized with ith index that is given and then left and right child eligibility is calculated and swap is done  after checking that whther min and ith index are not same means kahi root value hi toh min nhi then to no need of swap because root hi sabse choti value hogi  and this is recursively called until heap is corrected properly
        private void heapify(int i){
            int left = 2*i+1;
            int right=2*i+2;
            int min=i;

            if(left<arr.size()&&arr.get(min)>arr.get(left)){ //checks whther left is leaf node or not with first conndition and with second checks whether left is bigger or min if min> left then replace min value with left and same for right
                min=left;
            }
            if(right<arr.size()&& arr.get(min)>arr.get(right)){
                min=right;
            }
            if(min!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(min));
                arr.set(min,temp);
            
            heapify(min);
            }
        }
        //REMOVE ELEMENT 
        public int remove(){


        int data=arr.get(0); //element to be removed

        // swap first and last element
        int temp=arr.get(0);
        arr.set(0,arr.size()-1);
        arr.set(arr.size()-1,temp);


        // remove the last element
        arr.remove(arr.size()-1);   //0(1)

        heapify(0);
        return data;
        }

    }
    public static void main(String[] args) {
        
    }
}
