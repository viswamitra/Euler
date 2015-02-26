inp = gets.to_i
inp.times do 
	num = gets
	num = "%032d" % num.to_i.to_s(2)	
	num.size.times do |c|
		if num[c] == '0'
			num[c] = '1'
		else
			num[c] = '0'
		end	
	end
	p num.to_i(2)
end
