def paran_check(str):
  templst = []
  templst.append(a[0])
  for i in a[1:]:
    if (templst[-1]=='[' and i==']') or (templst[-1]=='{' and i=='}') or (templst[-1]=='(' and i==')'):
        templst.pop(-1)
    else:
        templst.append(i)
  if len(templst)==0:
    print "success"
    
def method1(string, string1):
    string="".join(sorted(string))
    string1="".join(sorted(string1))
        if string==string1:
            print "yes"
        else:
            print "no"
            
            
def method2(string, string1):
    dict1={}
    for i in string:
        if i in dict1.keys():
            dict1[i]+=1
        else:
            dict1[i]=1
    for i in string1:
        if i not in dict1.keys():
            print "fail"
            break
        else:
            dict1[i]-=1
    for i in dict1:
        if dict1[i] != 0:
            print "fail"
            break

