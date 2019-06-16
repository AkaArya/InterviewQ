def method1(string):
    string = "".join(sorted(string))
    for i in range(1,len(string)):
        if (string[i] == string[i-1]):
            print "fail"
            break
            
def method2(string):
    string = "".join(sorted(string))
    lst = []
    for i in string:
        if i in lst:
            print "fail"
            break
        else:
            lst.append(i)
