rules = [

{"if": {"Fever", "Cough"}, "then": "Flu"},
{"if": {"Flu"}, "then": "Recommend Rest"},
{"if": {"Flu"}, "then": "Recommend Medicine"},
{"if": {"Fever", "Bodyache"}, "then": "ViralInfection"},
{"if": {"ViralInfection"}, "then": "Recommend Fluids"}
]
# Initial facts
facts = {"Fever", "Cough"}
# Goal
def backward_chaining(goal, facts, rules, depth=0):
    indent = " " * depth
    if goal in facts:
        print(f"{indent}Goal '{goal}' is already known.")
        return True

    for rule in rules:
        if rule["then"] == goal:
            print(f"{indent}Trying to satisfy: {rule['if']} to prove {goal}")
            if all(backward_chaining(subgoal, facts, rules, depth+1) for subgoal in rule["if"]):
                print(f"{indent}Proved {goal}")
                facts.add(goal)
                return True
            print(f"{indent}Failed to prove {goal}")
            return False

# Test backward chaining
goal = "Recommend Rest"
print(f"Trying to prove: {goal}")
success = backward_chaining(goal, set(facts), rules)
print("\nFinal result:")
print("✔ Goal achieved!" if success else "❌ Goal not achieved.")