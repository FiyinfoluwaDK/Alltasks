principal = 1000.0

for rate_percent in range(5, 11):
    rate = rate_percent / 100.0
    print("Interest Rate:", rate_percent)
  

    for year in range(1, 11):
        amount = principal * (1.0 + rate) ** year
        print("amount:", amount)
    print()
