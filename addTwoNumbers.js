
//   Definition for singly-linked list.
//   function ListNode(val, next) {
//       this.val = (val===undefined ? 0 : val)
//       this.next = (next===undefined ? null : next)
//  }

/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
var remainder = 0;
var sum = 0;
let previousNode = new ListNode();
const headNode = previousNode;

   while(l1 || l2 || remainder){
      
       var val1 = 0;
       var val2 = 0;
       if(l1){
           val1 = l1.val;
           l1 = l1.next;
             
       }
       if(l2){
           val2 = l2.val;
           l2 = l2.next;
           
       }
       sum  = val1 + val2 + remainder;
       if(sum > 9){
           remainder = 1;
           sum = Number(String(sum)[String(sum).length - 1]);
           thereRemainder = true;

       }else{
           remainder = 0;
       }
       let currentNode = new ListNode(sum);
       previousNode.next = currentNode; 
       previousNode = currentNode;

   }




   return headNode.next;
    
};
