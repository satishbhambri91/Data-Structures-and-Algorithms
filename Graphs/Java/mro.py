class First(object):  
  def __init__(self):  
    super(First, self).__init__()  
    print("first")  
  
class Second(First):  
  def __init__(self):  
    super(Second, self).__init__()  
    print("second")  
  
class Third(First, Second):  
  def __init__(self):  
    super(Third, self).__init__()  
    print("third")  
  
Third();  