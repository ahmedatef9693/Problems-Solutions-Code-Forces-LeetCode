import operator
while True:
    operations = input("Please Enter Values : ").replace(" ","")
    if operations == "q":
        break
    full_data = []
    operands = ["*","+","-","/"]
    num = ''
    for op in operations:
        if op not in operands:
            num+=op
            
        else:
            full_data.append(float(num))
            num= ''
            full_data.append(op)
            
    full_data.append(float(num))
    
    i = 0
    ops = {
        "*": operator.mul,
        "/": operator.truediv
    }

    while i < len(full_data):
        if full_data[i] in ops:
            res = ops[full_data[i]](full_data[i-1] , full_data[i+1])
            full_data[i-1 : i+2] = [res]
            i=0
        else:
            i+=1

            
            
            
            
    res = full_data[0]
    for i in range(len(full_data)):
        if full_data[i] == "+":
            res += float(full_data[i+1])
        elif full_data[i] == "-":
            res -= float(full_data[i+1])
    print(res)
        
    




