class Container:
    def __init__(self,id1,length,breadth,height,pricepersqft):
        self.id1=id1
        self.length=length
        self.breadth=breadth
        self.height=height
        self.pricepersqft=pricepersqft
    def findVolume(self):
        return self.length*self.breadth*self.height
class Packaging:
    def __init__(self,l):
        self.containerlist=l
    def findContainerCost(self,id1):
        for obj in self.containerlist:
            if obj.id1==id1:  
                return obj.findVolume()*obj.pricepersqft
            else:
                continue
    
               
    def findLargestContainer(self):
        max1=0
        r=[]
        for obj in self.containerlist:  
            r.append(obj.findVolume)
        max1=max(r)
        result=obj
        return result
innum= int(input())
arrObj=[]
for i in range(innum):
    id1=input()
    length=input()
    breadth=input()
    height=input()
    pricesqft=input()
    arrObj.append(Container(id1,length,breadth,height,pricesqft))
id1=input()
t=Packaging(arrObj)
print(t.findContainerCost())
print(t.findLargestContainer())
