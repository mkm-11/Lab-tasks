//LAB TASK NO NEED TO SUBMIT
// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need
        public static Integer sumTree( BTNode root ){
            return sum(root, 0);
        }
        private static Integer sum(BTNode head, int level){
            if (head == null) {
                return 0;
            }
            int val = (Integer) head.elem;
            int add = 0;
            if(level==0){
                add = val;
            }
            else{
                add = val%level;
            }
            add+=sum(head.left, level+1);
            add+=sum(head.right, level+1);
            return add; //remove this line
        }
        //============================================================================

}
