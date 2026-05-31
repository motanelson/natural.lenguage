devices=["screen"]
devicesio=[0]
def outs(s):
    for a in s:
        print(a,end="")

def output(ports,s:str):
     outs("I/O="+str(ports)+":")
     outs(s)
     outs("\n")

def outdev(devicesA,s):
    counter:int=0
    for b in devices:
        if b==devicesA:
            
            output(counter,devices[counter]+":"+s)
            return counter
        counter=counter+1
            

def creatdevice(names,ports):
    counter:int=0
    for b in devices:
        if b==names:
            output(devicesio[counter],"error device clone")
            return counter
        counter=counter+1
            
    devices.append(names)
    devicesio.append(ports)

def listdev():
    counter:int=0
    for b in devices:
        
        outdev("screen",devices[counter])
        
        counter=counter+1



outdev("screen","start system")
creatdevice("serial1",1)
listdev()
outdev("serial1","hello world\n")
outdev("screen","end system")

