class Node
  attr_accessor :value,:next

  def initialize(value)
    @value = value
    @next = nil
  end
end

class LinkedList
  def initialize(val)
    @head = Node.new(val)
  end

  def addNode(val)
    current = @head
    while current.next != nil
      current = current.next
    end

    current.next = Node.new(val)
    self
  end

  def delete(val)
    current = @head
    if current.value == val
      @head = @head.next
    else
      while current.next.value != val && current.next != nil
        current = current.next
      end
      if (current != nil) && (current.next != nil)
        current.next = (current.next).next
      end
    end
  end


  def display
    current = @head
    while current.next !=nil
      print current.value," --> "
      current = current.next
    end
    print current.value
  end
end


ll = LinkedList.new(10)
ll.addNode(20)
ll.addNode(30)
ll.addNode(40)
ll.addNode(50)

ll.display