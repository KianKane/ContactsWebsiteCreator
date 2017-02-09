function updateSearch()
{
	var input = document.querySelector("input").value.toLowerCase();
	var rows = document.querySelectorAll("tr");
	var cols, i, j;
	
	
	if (input.length > 0)
	{
		for (i = 1; i < rows.length; i++)
		{
			var cols  = rows[i].querySelectorAll("td");
			rows[i].style.display = "none";
			for(j = 0; j < cols.length; j++)
			{
				if (cols[j].innerText.toLowerCase().indexOf(input) > -1)
				{
					rows[i].style.display = "";
				}
			}
		}
	}
	else
	{
		for (i = 1; i < rows.length; i++)
		{
			rows[i].style.display = "";
		}
	}
}

document.querySelector("input[type='text']").addEventListener("input", updateSearch);
