rules =  [
{"if": {"Fever", "Cough"}, "then": "Flu"},
{"if": {"Flu"}, "then": "Recommend Rest"},
{"if": {"Flu"}, "then": "Recommend Medicine"},
{"if": {"Fever", "Bodyache"}, "then": "ViralInfection"},
{"if": {"ViralInfection"}, "then": "Recommend Fluids"}
]
# Initial facts
facts = {"Fever", "Cough"}
# Forward chaining process
def forward_chaining(rules, facts):
    inferred = set()
    while True:
        new_inference = False
        for rule in rules:
            if rule["if"].issubset(facts) and rule["then"] not in facts:
                print(f"Inferred: {rule['then']}")
                facts.add(rule["then"])
                inferred.add(rule["then"])
                new_inference = True
        if not new_inference:
            break
    return facts
# Run
final_facts = forward_chaining(rules, facts)
print("\nFinal Knowledge Base:")
print(final_facts)