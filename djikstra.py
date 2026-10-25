class Item:
    def __init__(self, weight, value):
        self.weight = weight
        self.value = value
        self.ratio = value / weight

def fractional_knapsack(capacity, items):
    # Sort items by value-to-weight ratio in descending order
    items.sort(key=lambda x: x.ratio, reverse=True)
    
    total_value = 0.0
    for item in items:
        if capacity >= item.weight:
            capacity -= item.weight
            total_value += item.value
        else:
            # Take fraction of the remaining capacity
            total_value += item.ratio * capacity
            break
            
    return total_value

# Test
items = [Item(10, 60), Item(20, 100), Item(30, 120)]
capacity = 50
print("Maximum Value in Knapsack:", fractional_knapsack(capacity, items))