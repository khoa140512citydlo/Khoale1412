import heapq

# Định nghĩa đồ thị từ hình ảnh
graph = {
    'Arad': [('Zerind', 75), ('Timisoara', 118), ('Sibiu', 140)],
    'Zerind': [('Arad', 75), ('Oradea', 71)],
    'Oradea': [('Zerind', 71), ('Sibiu', 151)],
    'Timisoara': [('Arad', 118), ('Lugoj', 111)],
    'Lugoj': [('Timisoara', 111), ('Mehadia', 70)],
    'Mehadia': [('Lugoj', 70), ('Drobeta', 75)],
    'Drobeta': [('Mehadia', 75), ('Craiova', 120)],
    'Craiova': [('Drobeta', 120), ('Pitesti', 138), ('Rimnicu Vilcea', 146)],
    'Sibiu': [('Arad', 140), ('Oradea', 151), ('Fagaras', 99), ('Rimnicu Vilcea', 80)],
    'Rimnicu Vilcea': [('Sibiu', 80), ('Pitesti', 97), ('Craiova', 146)],
    'Fagaras': [('Sibiu', 99), ('Bucharest', 211)],
    'Pitesti': [('Rimnicu Vilcea', 97), ('Craiova', 138), ('Bucharest', 100)],
    'Bucharest': [('Fagaras', 211), ('Pitesti', 100), ('Giurgiu', 90), ('Urziceni', 85)],
    'Giurgiu': [('Bucharest', 90)],
    'Urziceni': [('Bucharest', 85), ('Hirsova', 98), ('Vaslui', 142)],
    'Hirsova': [('Urziceni', 98), ('Eforie', 86)],
    'Eforie': [('Hirsova', 86)],
    'Vaslui': [('Urziceni', 142), ('Iasi', 92)],
    'Iasi': [('Vaslui', 92), ('Neamt', 87)],
    'Neamt': [('Iasi', 87)]
}

# Định nghĩa heuristic (khoảng cách đường chim bay đến Bucharest)
heuristic = {
    'Arad': 366,
    'Zerind': 374,
    'Oradea': 380,
    'Timisoara': 329,
    'Lugoj': 244,
    'Mehadia': 241,
    'Drobeta': 242,
    'Craiova': 160,
    'Sibiu': 253,
    'Rimnicu Vilcea': 193,
    'Fagaras': 176,
    'Pitesti': 100,
    'Bucharest': 0,
    'Giurgiu': 77,
    'Urziceni': 80,
    'Hirsova': 151,
    'Eforie': 161,
    'Vaslui': 199,
    'Iasi': 226,
    'Neamt': 234
}

# Thuật toán UCS
def ucs(graph, start, goal):
    queue = [(0, start, [start])]  # (chi phí, nút hiện tại, đường đi)
    visited = set()

    while queue:
        (cost, current, path) = heapq.heappop(queue)

        if current in visited:
            continue

        visited.add(current)

        if current == goal:
            return path, cost

        for neighbor, neighbor_cost in graph.get(current, []):
            if neighbor not in visited:
                new_cost = cost + neighbor_cost
                new_path = path + [neighbor]
                heapq.heappush(queue, (new_cost, neighbor, new_path))

    return None, float('inf')

# Thuật toán Greedy Best-First Search
def greedy_best_first(graph, start, goal, heuristic):
    queue = [(heuristic[start], start, [start])]  # (heuristic, nút hiện tại, đường đi)
    visited = set()

    while queue:
        (_, current, path) = heapq.heappop(queue)

        if current in visited:
            continue

        visited.add(current)

        if current == goal:
            return path

        for neighbor, _ in graph.get(current, []):
            if neighbor not in visited:
                new_path = path + [neighbor]
                heapq.heappush(queue, (heuristic[neighbor], neighbor, new_path))

    return None

# Thuật toán A*
def a_star(graph, start, goal, heuristic):
    queue = [(0 + heuristic[start], 0, start, [start])]  # (f = g + h, g, nút hiện tại, đường đi)
    visited = set()

    while queue:
        (_, cost, current, path) = heapq.heappop(queue)

        if current in visited:
            continue

        visited.add(current)

        if current == goal:
            return path, cost

        for neighbor, neighbor_cost in graph.get(current, []):
            if neighbor not in visited:
                new_cost = cost + neighbor_cost  # g(n)
                f = new_cost + heuristic[neighbor]  # f(n) = g(n) + h(n)
                new_path = path + [neighbor]
                heapq.heappush(queue, (f, new_cost, neighbor, new_path))

    return None, float('inf')

# Chạy các thuật toán từ Arad đến Bucharest
start = 'Arad'
goal = 'Iasi'

# UCS
ucs_path, ucs_cost = ucs(graph, start, goal)
print("UCS - Đường đi:", ucs_path, "| Chi phí:", ucs_cost)

# Greedy Best-First Search
greedy_path = greedy_best_first(graph, start, goal, heuristic)
print("Greedy - Đường đi:", greedy_path)

# A*
a_star_path, a_star_cost = a_star(graph, start, goal, heuristic)
print("A* - Đường đi:", a_star_path, "| Chi phí:", a_star_cost)