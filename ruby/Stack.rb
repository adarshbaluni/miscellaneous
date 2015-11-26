class Stack

  def initialize(size)
    @top = -1
    @sizeOfStack = size
    @array = [] * @sizeOfStack
  end

  def push(value)
    if not isFull
      @top += 1
      @array[@top] = value
    end
  end



  def pop
    if not isEmpty
      @top -= 1
    end
  end

  def isEmpty
    if @top == -1
      return true
    else
      return false
    end
  end

  def isFull
    if @top == @sizeOfStack - 1
      return true
    else
      return false
    end
  end


  def printStack
    (0..@sizeOfStack).each {|i| print @array[i],"\t"}
  end



end

stackO = Stack.new(5)
stackO.push(1)
stackO.push(2)
stackO.push(3)
stackO.push(4)
stackO.push(5)
stackO.printStack




