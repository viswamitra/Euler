class Fctrl
  def meth
    a = gets.to_i
      (1..a).each do |v|
        b = gets.to_i
        sum = 0
        i = 1
        unless (5**i > b)
          sum +=(b/(5**i))
          i+=1
        end
        p sum
      end
  end
end
f = Fctrl.new
f.meth