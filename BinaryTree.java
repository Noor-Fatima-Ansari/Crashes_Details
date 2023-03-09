class BST {
    private int crashNo;
    int height;
    private BST left;
    private BST right;
 BST(){
     this.right=this;
     this.left=this;
     this.height=-1;
 }
private BST(int crashNo,BST left,BST right){
     this.crashNo=crashNo;
     this.left=left;
     this.right=right;
     height=1+Math.max(left.height,right.height);
}
 public static final BST Nil=new BST();
 public BST(int crashNo){
     this.crashNo=crashNo;
     right=left=Nil;
 }

public boolean add(int crashNo){
     int old=size();
     grow(crashNo);
   return size()  >old;
}

 public int size() {
     if (this == Nil) {
         return 0;
     } else {
         return 1 + left.size() + right.size();
     }
 }

public BST grow(int crashNo){
   if (this==Nil){return new BST(crashNo);}
   if (crashNo==this.crashNo){return this;}

if (crashNo<this.crashNo){
    left=left.grow(crashNo);
}
else {
    right=right.grow(crashNo);
}


//rebalance();
height=1+Math.max(left.height, right.height);
return this;
}

public static int rightMost(BST c){
   if (c.right == Nil) {
        return c.crashNo;
    }
    return c.rightMost(c.right);




  //  int rightmost;
//    Stack<BST> data=new Stack<>();
//    BST current=c;
//    while (c.right!=null  || !data.isEmpty()){
//      if (current.right!=null) {
//          data.push(current);
//          current=current.right;
//      }else {
//          current=data.pop();
//          break;}
//    }// while
//return current.crashNo;


}

public static int leftMost(BST c){
    if (c.left == Nil) {
        return c.crashNo;
    }
    return c.leftMost(c.left);
}

public String toString(){
     if (this==Nil) return " ";
     return left.toString()+" "+crashNo+" "+right.toString();
}



}
