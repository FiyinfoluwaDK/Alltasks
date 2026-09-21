for range in (5):
    temperature = float(int("enter temperature in Celcius: "))
    fahrenheit = (temperature * (9/5)) + 32
    
    if temperature < -273:
        print("Impossible!")
    else:
        print("The temperature in Fahrenheit: ", fahrenheit)
        


