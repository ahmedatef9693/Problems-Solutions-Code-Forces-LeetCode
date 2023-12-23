
//this problem dividing array into two different arrays in sum and total
var arr = [1, 2, 2, 3, 4, 6];
var total = calc_sum(arr)
var div_sum = total/2;
var len = arr.length / 2;
var div_arr1 = [];
var div_arr2 = [];

if(arr.length %2 === 0){
  for (let i = 0; i < arr.length; i++) {
    var curr_sum = calc_sum(div_arr1) + arr[i];
    if(div_arr1.length < len - 1 && curr_sum !== div_sum){
      div_arr1.push(arr[i]);
    }
    else if(div_arr1.length === len -1 && curr_sum === div_sum){
      div_arr1.push(arr[i]);
    }else{
      div_arr2.push(i)
    }

}
}else{
  console.log("condition not satisfied")
}



console.log("First Array : " + div_arr1);
console.log("Second Array : "+ div_arr2)

function calc_sum(arr) {
    var sum = 0;
    arr.forEach((element) => {
        sum += element;
    });
    return sum;
}
