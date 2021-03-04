class Player:
    def __init__(self,name,country,age,matches,runs,wickets):
        self.playerName=name
        self.playerCountry=country
        self.playerAge=age
        self.noOfMatches=matches
        self.noOfRuns=runs 
        self.noOfWickets=wickets

class Team:
    def __init__(self,l):
        self.list=l

    def getMaxwickets(self):
        minRuns=self.noOfRuns
        for obj in list:
            if minRuns>obj.noOfRuns:
                minRuns=obj.noOfRuns
            else:
                continue
        return minRuns

    def getMinRuns(self):
        maxWickets=self.noOfWickets
        for obj in list:
            if obj.noOfWickets>maxWickets:
                maxWickets=obj.noOfWickets
            else:
                continue
        return maxWickets
innum=int(input())
arrObj=[]
for i in range (innum):
    name= input()
    country=input()
    age=int(input())
    matches=int(input())
    runs=int(input())
    wickets=int(input())
    arrObj.append(Player(name,country,age,matches,runs,wickets))
t=Team()
print(t.getMinRuns())
print(t.getMaxwickets())


