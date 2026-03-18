def dfs(graph, node, visited):
    visited.add(node)
    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(graph, neighbor, visited)

def count_components(graph):
    visited = set()
    count = 0

    for node in graph:
        if node not in visited:
            dfs(graph, node, visited)
            count += 1

    return count

graph = {
    1: [2],
    2: [1, 3],
    3: [2],
    4: [5],
    5: [4]
}

print(count_components(graph))