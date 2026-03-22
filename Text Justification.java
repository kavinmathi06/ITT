# You are using Python
def fulljus(words,maxWidth):
    res,cur,num_of_let=[],[],0
    
    for w in words:
        if num_of_let+len(w)+len(cur)>maxWidth:
            for i in range(maxWidth - num_of_let):
                cur[i%(len(cur)-1 or 1)]+= ' '
            res.append(''.join(cur))
            cur,num_of_let=[],0
        cur.append(w)
        num_of_let+=len(w)
    last_line=' '.join(cur)
    res.append(last_line+' '*(maxWidth-len(last_line)))
    
    return res
import sys
def solve():
    try:
        input_data=sys.stdin.read().split()
        if not input_data:
            return
        n=int(input_data[0])
        words=input_data[1:n+1]
        max_Width=int(input_data[n+1])
        
        formatted_text=fulljus(words,max_Width)
        for line in formatted_text:
            print(line)
    except EOFError:
        pass
if __name__=="__main__":
    solve()