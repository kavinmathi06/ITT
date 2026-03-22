# You are using Python
def solve():
    try:
        line=input().strip()
        if not line:
            return
        n=int(line)
    except EOFError:
        return
    valid_map={0:0,1:1,6:9,8:8,9:6}
    valid_digits=[0,1,6,8,9]
    count=0;
    
    def is_confusion(num):
        orginal=num;
        rotated=0
        mult=1
        temp=num
        rotated_str=""
        while temp>0:
            digit=temp%10
            rotated_str+=str(valid_map[digit])
            temp//=10
        rotated=int(rotated_str) if rotated_str else 0
        return rotated!=orginal
    def dfs(current_num):
        nonlocal count
        if current_num>n:
            return
        if is_confusion(current_num):
            count+=1
        for digit in valid_digits:
            next_num=current_num*10+digit
            if next_num<=n:
                dfs(next_num)
    for digit in [1,6,8,9]:
        dfs(digit)
    print(count)
solve()