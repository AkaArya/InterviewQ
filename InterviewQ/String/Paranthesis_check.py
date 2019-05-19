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
