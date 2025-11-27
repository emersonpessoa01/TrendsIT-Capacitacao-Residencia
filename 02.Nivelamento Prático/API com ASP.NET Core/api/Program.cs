using api.data;
using Microsoft.EntityFrameworkCore;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container
builder.Services.AddOpenApi();

// Configurar o EF Core com MySQL
builder.Services.AddDbContext<DataContent>(options =>
    options.UseMySql(
        builder.Configuration.GetConnectionString("conexaoMySQL"),
        ServerVersion.AutoDetect(builder.Configuration.GetConnectionString("conexaoMySQL"))
    )
);

var app = builder.Build();
