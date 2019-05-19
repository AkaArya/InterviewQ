def method1(A):
  s=0
  sp=0
  for i in range(len(a)):
    for j in range(len(a)):
      s=0
      for k in range(i,j+1):
        s+=a[k]
      if s>sp:
        sp=s
        st=i
        se=j
  return sp,st,se
  
  def method2(A):
    for i in a[1:]:
      # include krke better h ya bina include kre
      cursum = max(cursum + i, i)
      # is wali array ka sum zyada h ya pichli array ka
      maxsum = max(cursum, maxsum)
    return maxsum
    
 method2([-2,1,-3,4,-1,2,1,-5,4])
