import frequency.Manager

Manager manager = new Manager("../data/file.bin")
manager.countFrequencies()

File res = new File("../data/result.txt")
res.write(manager.buildString())

