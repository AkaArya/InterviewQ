def subarray_given_sum(a, givemsum):
  s=0
  start=0
  end=-1
  for i in range(0,len(a)):
    if s<givensum:
        s+=a[i]
        end+=1
        if s==givensum :
            print start+1,end+1
            s-=a[start]
            start+=1
        elif s>givensum:
            s-=a[start]
            start+=1
            if s==givensum:
                print start+1,end+1
                s-=a[start]
                start+=1
                
subarray_given_sum([1,2,3,4,5,6,7,8,9,10],15)
