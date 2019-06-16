def method1(string, string1):
    flag=0
    dict1={}
    #more than one difference
    if abs(len(string)-len(string1))>1:
        return False
    #checking deletion
    if len(string)-len(string1)==1:
        for i, j in zip(string, string1):
            if i!=j:
                string = string.replace(i, '')
                break
        for i, j in zip(string, string1):
            if i!=j:
                return False
        return True
    #checking replacement and insertion
    if len(string)-len(string1)==-1:
        flag+=1
    for i, j in zip(string, string1):
        if i!=j:
            flag+=1
            if flag==2:
                return False
    return True
    
    if __name__=='__main__':
      method1("pale", "ple")
      method1("pale", "pales")
      method1("pale", "bale")
      method1("pale", "bake")
