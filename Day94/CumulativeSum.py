def Cumulative(lists):
	cu_list = []
	n = len(list1)
	cu_list = [sum(list1[0:x:1]) for x in range(0, n+1)]
	return cu_list[1:]

list1 = [4,5,3,1,2]
print (Cumulative(list1))
