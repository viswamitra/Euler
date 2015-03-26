class LoveLetter
	def work(n)
		first = n[0..n.size/2-1]
		second = ""
		if (n.size % 2 == 0)			
			second = n[n.size/2..n.size]
		else
			second = n[n.size/2+1..n.size]
		end		
		first = first.reverse!
		p divide(first, second)
	end

	def divide(first, second)
		sum = 0
		if first == second 
			0
		else
			first.size.times do |i|		
				res = first[i][0].ord - second[i][0].ord					
				res = res * 1 if res > 0
				res = res * -1 if res < 0
				sum = sum + res;					
			end
		end			
		sum
	end

	def main
		a = gets.to_i
		a.times do 
			n = gets.gsub("\n","")			
			work(n)
		end
	end
end

love = LoveLetter.new
love.main
