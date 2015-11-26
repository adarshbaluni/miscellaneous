class Stack

  def initialize(size)
    @top = -1
    @sizeOfStack = size
    @arrayForMin = [] * @sizeOfStack
    @array = [] * @sizeOfStack
    @min = nil
  end

  def push(value)
    if not isFull
      @top += 1
      @array[@top] = value
      if(@min == nil || value <= @min)
        @min = value
        @arrayForMin[@top] = @min
      else
        @arrayForMin[@top] = @min
      end

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
      (0..@sizeOfStack-1).each {|i| print @array[i],"->",@arrayForMin[i],"\n"}
    end



  end

  stackO = Stack.new(5)
  stackO.push(4)
  stackO.push(2)
  stackO.push(4)
  stackO.push(1)
  stackO.push(5)
  stackO.printStack




